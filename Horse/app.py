import time

from flask import Flask, render_template, request, jsonify
import pickle

app = Flask(__name__)
# 大于50%的建议放到这里
positive_suggestion = 'For horses over 50%, a mare with excellent pedigree and genetic advantages, as well as a good physical condition can be invested with high confidence. A stallion, in addition to considering its physical condition, if its offspring also have a high winning rate, you can invest with confidence as well. '
# 小于50%的建议放到这里
negative_suggestion = 'When the final probability is below 50, prudent investment is recommended, because the probability is relatively small, some small amount of investment can be made, but it is not recommended to make large amount of investment, because it will still cause risks.'

# Load the model
with open('templates/model.pkl', 'rb') as f:
    model = pickle.load(f)


# Define the routes
@app.route('/')
def home():
    return render_template('predict.html')

@app.route('/predict', methods=['POST'])
def predict():
    # Get the form data
    speed = float(request.form['speed'])
    stamina = float(request.form['stamina'])
    power = float(request.form['power'])
    guts = float(request.form['guts'])
    knowledge = float(request.form['knowledge'])
    proficient = int(request.form['proficient'])

    # Preprocess the input data
    input_data = [[speed, stamina, power, guts, knowledge, proficient]]

    # Make the prediction
    win_rate = model.predict(input_data)[0]

    if win_rate > 0.5:
        msg = positive_suggestion
    else:
        msg = negative_suggestion

    return render_template('result.html',
                           prediction={'win_rate': '{:.2f}'.format(win_rate * 100),
                                       'lose_rate': '{:.2f}'.format(100 - win_rate * 100)},
                           form_data={
                               'speed': int(speed), 'stamina': int(stamina), 'power': int(power), 'guts': int(guts),
                               'knowledge': int(knowledge), 'proficient': int(proficient)},
                           suggestion=msg
                           )


# Run the app
if __name__ == '__main__':
    app.run(debug=False)

import pickle
from sklearn.neural_network import MLPRegressor
import pandas as pd
import numpy as np

# Data Preprocessing
data = pd.read_csv('./TrainingData/horse_training.csv')
X_train = np.array(data.iloc[:, 1:7], dtype=np.float)
y_train = np.array(data.iloc[:, -1], dtype=np.float)
# Build MLP Podel
model = MLPRegressor(hidden_layer_sizes=(32, 64, 32), activation='logistic', solver='adam', max_iter=1000, verbose=1)
# Train
model.fit(X_train, y_train)

# Save Model
with open('./templates/model.pkl', 'wb') as f:
    pickle.dump(model, f)

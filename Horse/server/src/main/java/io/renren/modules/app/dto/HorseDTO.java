package io.renren.modules.app.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2023-04-11
 */
@Data
@ApiModel(value = "")
public class HorseDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "")
	private Integer id;

	@ApiModelProperty(value = "")
	private String horseName;

	@ApiModelProperty(value = "")
	private String speed;

	@ApiModelProperty(value = "")
	private String stamina;

	@ApiModelProperty(value = "")
	private String power;

	@ApiModelProperty(value = "")
	private String guts;

	@ApiModelProperty(value = "")
	private String knowledge;

	@ApiModelProperty(value = "")
	private String proficent;

	@ApiModelProperty(value = "")
	private String previousWinningRatio;

	@ApiModelProperty(value = "")
	private String raceDate;

	@ApiModelProperty(value = "")
	private String raceGround;


}
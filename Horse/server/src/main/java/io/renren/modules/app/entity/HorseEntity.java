package io.renren.modules.app.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2023-04-11
 */
@Data
@TableName("horse")
public class HorseEntity {

    /**
     * 
     */
	private Integer id;
    /**
     * 
     */
	private String horseName;
    /**
     * 
     */
	private String speed;
    /**
     * 
     */
	private String stamina;
    /**
     * 
     */
	private String power;
    /**
     * 
     */
	private String guts;
    /**
     * 
     */
	private String knowledge;
    /**
     * 
     */
	private String proficent;
    /**
     * 
     */
	private String previousWinningRatio;
    /**
     * 
     */
	private String raceDate;
    /**
     * 
     */
	private String raceGround;
}
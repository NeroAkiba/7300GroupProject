package io.renren.modules.app.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2023-04-11
 */
@Data
public class HorseExcel {
    @Excel(name = "")
    private Integer id;
    @Excel(name = "")
    private String horseName;
    @Excel(name = "")
    private String speed;
    @Excel(name = "")
    private String stamina;
    @Excel(name = "")
    private String power;
    @Excel(name = "")
    private String guts;
    @Excel(name = "")
    private String knowledge;
    @Excel(name = "")
    private String proficent;
    @Excel(name = "")
    private String previousWinningRatio;
    @Excel(name = "")
    private String raceDate;
    @Excel(name = "")
    private String raceGround;

}
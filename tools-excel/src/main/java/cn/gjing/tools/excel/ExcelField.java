package cn.gjing.tools.excel;

import cn.gjing.tools.excel.convert.DataConvert;
import cn.gjing.tools.excel.convert.DefaultDataConvert;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Excel list headers map to entity fields annotation
 *
 * @author Gjing
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ExcelField {
    /**
     * Excel header name
     *
     * @return name
     */
    String value();

    /**
     * Excel header width
     *
     * @return cell width
     */
    int width() default 5120;

    /**
     * The list headers are sorted by default by entity field if the Numbers are the same
     *
     * @return sort index
     */
    int sort() default 99;

    /**
     * Column format
     * @return format
     */
    String format() default "";

    /**
     * If a cell has the same number of rows, merge automatically
     *
     * @return autoMerge
     */
    Merge autoMerge() default @Merge;

    /**
     * Cell sum
     *
     * @return Sum
     */
    Sum sum() default @Sum;

    /**
     * Excel style
     *
     * @return ExcelStyle
     */
    Class<? extends ExcelStyle> style() default DefaultExcelStyle.class;

    /**
     * Is allow empty
     *
     * @return boolean
     */
    boolean allowEmpty() default true;

    /**
     * Data convert
     *
     * @return DefaultDataConvert.class
     */
    Class<? extends DataConvert<?>> convert() default DefaultDataConvert.class;
}

/**
 * 
 */
package com.formula.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Leon(Liu Yang)
 * Ideas from Formula Innovation
 */
@Target(ElementType.METHOD) //表示该注解标注在方法上
@Retention(RetentionPolicy.RUNTIME) //表示该注解保留到runtime阶段，将被JVM保留,所以它能在运行时被JVM或其他使用反射机制的代码所读取和使用.
@Documented //表示该注解会被 javadoc 之类的工具处理, 所以注解类型信息也会被包括在生成的文档中
public @interface LoggerManage {
	public String description();
}

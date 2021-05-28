package com.example.scrum.domain;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Documented
@Inherited
public @interface Entity {
	String identity();
}

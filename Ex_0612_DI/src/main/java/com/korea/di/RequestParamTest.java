package com.korea.di;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamTest {

	//@RequestParam
	//요청파라미터를 연결할 매개변수에 붙히는 어노테이션
	//@RequestParam("가져올데이터의 이름")데이터타입 변수명
	//생략가능
	//name="year"는 파라미터의 이름
	//required true면 null값 비허용, false면 null값 허용
	@RequestMapping("/requestParam")
	//public String main(@RequestParam(name="year",required=false) String year) {
	public String main(String year) {
		System.out.printf("[%s]year=[%s]%n",new Date(),year);
		return "yoil";
	}
	
	@RequestMapping("/requestParam2")
	//public String main2(@RequestParam(name="year",required=true) String year) {
	public String main2(@RequestParam String year) {
		System.out.printf("[%s]year=[%s]%n",new Date(),year);
		return "yoil";
	} 
	
	@RequestMapping("/requestParam3")
	public String main3(@RequestParam(defaultValue="1") String year) {
		System.out.printf("[%s]year=[%s]%n",new Date(),year);
		return "yoil";
	} 
	
}








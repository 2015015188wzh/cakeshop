package com.food.cakeshop.service;

public class PagerServiceImpl {    //����ҳ��Ҫ�ѵ�ǰҳ��ÿҳ��ʾ������
	private static ThreadLocal<Integer> offset = new ThreadLocal<Integer>();
	private static ThreadLocal<Integer> size = new ThreadLocal<Integer>();
	public static Integer getOffset() {
		return offset.get();
	}
	public static void setOffset(ThreadLocal<Integer> offset) {
		PagerServiceImpl.offset = offset;
	}
	public static Integer getSize() {
		return size.get();
	}
	public static void setSize(ThreadLocal<Integer> size) {
		PagerServiceImpl.size = size;
	}
	public static void removeSize() {
		size.remove();
	}
	
	

}

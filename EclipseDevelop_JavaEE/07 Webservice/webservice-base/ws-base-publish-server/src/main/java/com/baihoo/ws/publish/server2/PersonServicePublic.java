package com.baihoo.ws.publish.server2;

import javax.xml.ws.Endpoint;
/**
 * 发布person服务
 * @author Administrator
 *
 */
public class PersonServicePublic {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8889/person", new PersonService());
	}
}

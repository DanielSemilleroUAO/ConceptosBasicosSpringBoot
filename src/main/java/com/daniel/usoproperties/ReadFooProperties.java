package com.daniel.usoproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:foo.properties")
public class ReadFooProperties {
	
	@Value("${app.foo.client}")
	private String clientUrl;
	@Value("${app.foo.customer:/app-foo/customer}")
	private String customUrl;
	
	public String getClientUrl() {
		return clientUrl;
	}
	public void setClientUrl(String clientUrl) {
		this.clientUrl = clientUrl;
	}
	public String getCustomUrl() {
		return customUrl;
	}
	public void setCustomUrl(String customUrl) {
		this.customUrl = customUrl;
	}
	
	
	
	
}

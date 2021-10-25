package com.neotech.lesson05;

import com.neotech.utils.ConfigsReader;

public class OpenOrangeHRM2 {

	public static void main(String[] args) {
		ConfigsReader.readProperties(("user.dir")+"/configs/configuration.properties");

	}

}

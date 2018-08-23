package com.nano.pro;

import java.util.Arrays;

public class Body {
private String name;
private String email[];



public String[] getEmail() {
	return email;
}

public void setEmail(String[] email) {
	this.email = email;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Body [name=" + name + ", email=" + Arrays.toString(email) + "]";
}


}

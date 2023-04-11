package serialization;

import java.io.Serializable;

public class customer implements Serializable
{
/*
 * 
 */
private static final long serialVersionUID= 1L;
public int id;
public String name;
public String city;
public transient int pin;
}


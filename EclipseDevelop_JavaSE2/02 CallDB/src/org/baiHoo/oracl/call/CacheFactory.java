package org.baiHoo.oracl.call;


import java.util.HashMap;
import java.util.Map;


public class CacheFactory
{

    public static Map dictionaryCache = new HashMap();
    public static Map constantsCache = new HashMap();
    public static Map projectPropertiesCache = new HashMap();
    public static Map vmCache = new HashMap();
    public static Map domianCache = new HashMap();
   // public static ServletContext servletContext;

    public CacheFactory()
    {
    }

    public static String getConstants(String key)
    {
        return (String)constantsCache.get(key);
    }

    public static String getProject(String key)
    {
        return (String)projectPropertiesCache.get(key);
    }
    /*
	public static ServletContext getServletContext() {
		return servletContext;
	}

	public static void setServletContext(ServletContext servletContext) {
		CacheFactory.servletContext = servletContext;
	}
	*/
}

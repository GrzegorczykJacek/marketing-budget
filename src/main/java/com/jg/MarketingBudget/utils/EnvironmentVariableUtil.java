package com.jg.MarketingBudget.utils;

public class EnvironmentVariableUtil {

    public static String getEnvVariable(String key) {
        return System.getenv(key.replace(".","_"));
    }

}

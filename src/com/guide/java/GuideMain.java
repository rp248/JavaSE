package com.guide.java;

import com.guide.java.lambdas.topics.CustomerFunctionalInterface;
import com.guide.java.lambdas.topics.FunctionFunctionalInterface;
import com.guide.java.lambdas.topics.LambdaBasic;
import com.guide.java.lambdas.topics.LambdaExpressions;

public class GuideMain {
    public static void main(String a[]) {
        Topic topic = new FunctionFunctionalInterface();
        topic.run();
    }
}

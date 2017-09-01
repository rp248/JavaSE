package com.guide.java.lambdas.topics;

import com.guide.java.Topic;
import com.guide.java.lambdas.apis.OuterClass;

public class LambdaExpressionScope implements Topic {

    @Override
    public void run() {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.InnerClassMethod(24);
    }
}

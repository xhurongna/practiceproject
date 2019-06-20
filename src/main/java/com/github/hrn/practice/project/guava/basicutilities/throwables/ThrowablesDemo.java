package com.github.hrn.practice.project.guava.basicutilities.throwables;

import com.google.common.base.Throwables;

import java.sql.SQLException;

/**
 * @author 胡荣娜
 * @date 2019/3/30
 */
public class ThrowablesDemo {
    public static void main(String[] args) {
        try {
            throwablesProgagte();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void throwablesProgagte() throws SQLException{
        try {
//            throwRuntimeException();
            throwSQLException();
        } catch (Throwable throwable) {
//            throwables.propagateIfInstanceOf(throwable, SQLException.class);
            //todo 只抛出error和runtimeException,通过实现可以看出
//            throwables.propagateIfPossible(throwable);
//            throwables.propagate(throwable);
            System.out.println("root cause " + Throwables.getRootCause(throwable));
            System.out.println("causal chain " +  Throwables.getCausalChain(throwable));
            System.out.println("trace " + Throwables.getStackTraceAsString(throwable));
            System.out.println("lazy stackTrace " + Throwables.lazyStackTrace(throwable));
            System.out.println("lazy stackTrace is lazy " + Throwables.lazyStackTraceIsLazy());
        }
    }

    public static void throwError() {
        throw new Error("Error 异常");
    }

    public static void throwSQLException() throws SQLException {
        throw new SQLException("SQLException 异常");
    }

    public static void throwRuntimeException() {
        throw new RuntimeException("runtime Exception");
    }

    public static class Employee {
        private Integer userCode;
        private String userName;

    }
}

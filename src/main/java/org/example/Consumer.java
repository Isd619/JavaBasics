package org.example;

@FunctionalInterface
public interface Consumer<T, R> {
    R apply(T t);
}

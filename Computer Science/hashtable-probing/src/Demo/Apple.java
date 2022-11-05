package Demo;

import java.util.Objects;

public class Apple {
    String color;

    Apple(String color){
        this.color=color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return color.equals(apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}

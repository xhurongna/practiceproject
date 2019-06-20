package com.github.hrn.practice.project.guava.objects;

import com.google.common.base.Objects;

/**
 * @author 胡荣娜
 * @date 2019/3/23
 */
public class ObjectsEqual {
    public static void main(String[] args) {
        System.out.println("null == null " + Objects.equal(null, null));
        System.out.println(Objects.equal(new Integer(1), 1));
        System.out.println(Objects.equal(new Integer(129), new Integer(129)));

        User userA = new User();
        userA.setId(1);
        userA.setName("hhh");

        User userB = new User();
        userB.setId(1);
        userB.setName("hhh");

        System.out.println("userA == userB " + Objects.equal(userA, userB));
    }

    static class User {
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return id == user.id &&
                    java.util.Objects.equals(name, user.name);

        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(id, name);
        }

    }
}

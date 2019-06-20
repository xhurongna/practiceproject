package com.github.hrn.practice.project.guava.objects;

import com.google.common.base.MoreObjects;

/**
 * @author 胡荣娜
 * @date 2019/3/30
 */
public class ObjectsToString {

    public static void main(String[] args) {

        User user = new User();
        user.setId(1);

        System.out.println(user);
    }

    public static class User {
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
        public String toString() {
            return MoreObjects.toStringHelper(this)
                    .add("id", id)
                    .add("name", name)
                    .toString();
        }
    }
}

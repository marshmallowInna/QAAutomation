package inheritance;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class Person {
    /**
     * This is a representation of an abstract person.
     */

        private String name;
        private String gender;
        private String address;

    public Person() {
    }

    public Person(String name, String address) {
            this.name = name;
            this.address = address;
        }

        /**
         * Describes how a person is doing their work to earn money.
         */
        public abstract void work();
        char grade;

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public String getAddress() {
            return address;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }


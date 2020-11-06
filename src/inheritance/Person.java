package inheritance;

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
            this.name = name ;
            this.address = address;
        }

        /**
         * Describes how a person is doing their work to earn money.
         * @return
         */
        public abstract void work(double a, double b);
        double a = 5.500;
        double b = 12;
        double earnYear = a*b;

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


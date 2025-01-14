
public class Restaurant1 {
        private String name;
        private String location;
        private String specialtyDish;

        // constructor that initialize fields
        public Restaurant1(String name, String location, String specialtyDish) {
            this.name = name;
            this.location = location;
            this.specialtyDish = specialtyDish;

        }

        // overload constructor null values
        public Restaurant1() {
            this.name = null;
            this.location = null;
            this.specialtyDish = null;
        }

        // getter and setter for name
        public String getName() {

            return name;
        }

        public void setName(String name) {

            this.name = name;
        }

        // getter and setter for location
        public String getLocation() {

            return location;
        }
        public void setLocation(String location) {
            this.location = location;
        }
        // getter and setter for specialtyDish
        public String getSpecialtyDish() {
            return specialtyDish;
        }
        public void setSpecialtyDish(String specialtyDish) {

            this.specialtyDish = specialtyDish;
        }

        // custom method about specialty dish
        public String describeSpecialtyDish() {
            return "Our specialty dish is " + specialtyDish + " a true delicacy!";
        }

        // print method
        public void printDetails() {
            System.out.println("Welcome to  " + name + ", We are located in " + location + ", and our specialty dish is " + specialtyDish);
        }


    }



package programmingWithClasses.elementaryClassesAndObjects;

/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {

    private String secondName;
    private int numberGroup;
    private int [] progress = new int[5];

    public Student(String secondName, int numberGroup, int [] progress){


    }

        public void setSecondName (String s){
            this.secondName = s;
        }

        public String getSecondName () {
            return secondName;
        }

        public void setNumberGroup ( int numberGroup){
            this.numberGroup = numberGroup;
        }

        public int getNumberGroup () {
            return numberGroup;
        }

        public void setProgress ( int[] progress){
            this.progress = progress;
        }

        public int[] getProgress () {
            return progress;
        }

        //возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
        public void printSecondName ( Student [] a){

            boolean check = false;

            for (int j = 0; j<a.length; j++) {
                for (int i = 0; i < getProgress().length; i++) {

                    if (a[j].getProgress()[i] == 9 || a[j].getProgress()[i] == 10) {

                        check = true;
                    } else {
                        check = false;
                        break;
                    }
                }


                if (check == true) {

                    System.out.println("Фамилия ученика: " + a[j].getSecondName());
                    System.out.println("Номер группы ученика: " + a[j].getNumberGroup());
                } else {
                    System.out.println("Данный ученик не подходит под условия задания");
                }
            }
        }

}


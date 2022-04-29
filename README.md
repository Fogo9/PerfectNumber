# **PERFECT NUMBER**

## INFORMATION

* **Queries whether a number is a perfect number.**

## TECHNOLOGIES USED

* **JAVA**

## CONTENTS

* The variables **i**, **total** and **number** are defined with int.

* Scanner class created for user to enter numbers.

## CODES

```Java

        import java.util.Scanner;

        public class perfectnumber{

            public static void main(String[] args) {

                int i, number, total = 0;

                Scanner input = new Scanner(System.in);

                System.out.print("Enter The Number : ");

                number = input.nextInt();


```

```Java

                for(i = 1; i < number; i++){

                    if(number % i == 0){

                        total += i;

                    }

                }

                if(total == number){

                    System.out.println(number + " is The Perfect Number. ");

                }else{

                    System.out.println(number + " is not a Perfect Number. ");

                }
            }
        }

```

```bash

    Enter The Number : 28
    28 is The Perfect Number.
    Enter The Number : 1
    1 is not a Perfect Number.
    Enter The Number : 496
    496 is The Perfect Number.

```

<br />

## LINK

* Click here https://github.com/Fogo9/PerfectNumber.git to access the Github page for this project.

<br />

## LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |

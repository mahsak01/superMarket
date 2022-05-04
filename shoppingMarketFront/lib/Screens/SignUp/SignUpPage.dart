import 'package:flutter/material.dart';

class SignUpPage extends StatelessWidget {
  const SignUpPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Stack(
        alignment: Alignment.center,
        children: [
          Container(
            width: MediaQuery.of(context).size.width,
            height: MediaQuery.of(context).size.height,
            decoration: const BoxDecoration(
              image: DecorationImage(
                  image: AssetImage('assets/images/LogIn.png'),
                  fit: BoxFit.cover),
            ),
          ),
          SizedBox(
            width: MediaQuery.of(context).size.width / 3,
            height: MediaQuery.of(context).size.height / 1.1,
            child: Container(
              decoration: const BoxDecoration(color: Colors.white),
              child: Padding(
                padding: const EdgeInsets.all(30),
                child: Directionality(
                  textDirection: TextDirection.rtl,
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.center,
                    children: [
                      Text(
                        "ثبت نام",
                        style: TextStyle(fontSize: 40),
                      ),
                      SizedBox(
                        height: 30,
                      ),
                      TextField(
                        decoration: InputDecoration(
                          fillColor: Colors.white,
                          filled: true,
                          labelText: "نام کاربری",
                          labelStyle:
                              TextStyle(fontSize: 15, color: Colors.blue),
                          prefixIcon: Icon(
                            Icons.person_pin_outlined,
                            color: Colors.blue,
                          ),
                        ),
                        textDirection: TextDirection.rtl,
                      ),
                      SizedBox(
                        height: 20,
                      ),
                      TextField(
                        decoration: InputDecoration(
                          fillColor: Colors.white,
                          filled: true,
                          labelText: "نام",
                          labelStyle:
                          TextStyle(fontSize: 15, color: Colors.blue),
                          prefixIcon: Icon(
                            Icons.person,
                            color: Colors.blue,
                          ),
                        ),
                        textDirection: TextDirection.rtl,
                      ),
                      SizedBox(
                        height: 20,
                      ),
                      TextField(
                        decoration: InputDecoration(
                          fillColor: Colors.white,
                          filled: true,
                          labelText: "نام خانوادگی",
                          labelStyle:
                          TextStyle(fontSize: 15, color: Colors.blue),
                          prefixIcon: Icon(
                            Icons.family_restroom,
                            color: Colors.blue,
                          ),
                        ),
                        textDirection: TextDirection.rtl,
                      ),
                      SizedBox(
                        height: 20,
                      ),
                      TextField(
                        decoration: InputDecoration(
                          fillColor: Colors.white,
                          filled: true,
                          labelText: "ایمیل",
                          labelStyle:
                          TextStyle(fontSize: 15, color: Colors.blue),
                          prefixIcon: Icon(
                            Icons.email,
                            color: Colors.blue,
                          ),
                        ),
                        textDirection: TextDirection.rtl,
                      ),
                      SizedBox(
                        height: 20,
                      ),
                      TextField(
                        decoration: InputDecoration(
                          fillColor: Colors.white,
                          filled: true,
                          labelText: "تلفن",
                          labelStyle:
                          TextStyle(fontSize: 15, color: Colors.blue),
                          prefixIcon: Icon(
                            Icons.phone,
                            color: Colors.blue,
                          ),
                        ),
                        textDirection: TextDirection.rtl,
                      ),
                      SizedBox(
                        height: 20,
                      ),
                      TextField(
                        decoration: InputDecoration(
                          fillColor: Colors.white,
                          filled: true,
                          labelText: "رمز عبور",
                          labelStyle:
                              TextStyle(fontSize: 15, color: Colors.blue),
                          prefixIcon: Icon(
                            Icons.key,
                            color: Colors.blue,
                          ),
                        ),
                        textDirection: TextDirection.rtl,
                      ),
                      SizedBox(
                        height: 30,
                      ),
                      TextButton(
                          onPressed: () {},
                          style: TextButton.styleFrom(
                            backgroundColor: Colors.blue,
                            minimumSize: Size(500, 60),
                          ),
                          child: Text(
                            "ثبت نام کنید",
                            style: TextStyle(fontSize: 30, color: Colors.white),
                          ))
                    ],
                  ),
                ),
              ),
            ),
          ),
        ],
      ),
    );
  }
}

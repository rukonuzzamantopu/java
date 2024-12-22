/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2;
class Rectangle extends Shape {

  Rectangle(double dim1, double dim2) {
    super(dim1, dim2);
  }

  @Override
  double area() {
    return dim1 * dim2;
  }
}

// 리스트 35.4  Model 클래스의 첫 번째 버전

package org.stairwaybook.scells

class Model(val height: Int, val width: Int) {

  case class Cell(row: Int, column: Int)

  val cells = new Array[Array[Cell]](height, width)

  for (i <- 0 until height; j <- 0 until width)
    cells(i)(j) = new Cell(i, j)
}

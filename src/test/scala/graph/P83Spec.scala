package graph

import org.scalatest.funspec.AnyFunSpec
import scala.language.implicitConversions

class P83Spec extends AnyFunSpec:
  it("construct all spanning trees"):
    val data: List[List[Edge[Char, Char]]] = List(
      List(('a', 'b'), ('b', 'c'), ('a', 'c'))
    )
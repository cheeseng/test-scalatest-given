package graph

case class Edge[A, B](u: A, v: A, data: Option[B])
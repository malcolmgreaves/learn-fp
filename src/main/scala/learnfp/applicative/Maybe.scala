package learnfp.applicative

import learnfp.functor.Maybe.Maybe
import learnfp.functor.{MaybeInstance => MaybeFunctorInstance}

import learnfp.functor.Maybe.{Maybe, Just, Nothing}


object MaybeInstance {
  import MaybeFunctorInstance._
  import learnfp.functor.FunctorOps._
  implicit def idApplicativeInstance[A, R] = new Applicative[A, R, Maybe] {
    override def pure[A](a: A): Maybe[A] = ???
    override def <*>(fx: Maybe[A => R])(a: Maybe[A]): Maybe[R] = ???
  }
}

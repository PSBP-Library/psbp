package psbp.external.implementation.stdOut.givens

import psbp.external.specification.types.&&

import psbp.external.specification.writing.Writable

import psbp.external.implementation.stdOut.StdOut

given stdOutWritable: Writable[StdOut] with

  // defined

  def empty: StdOut = 
    println("EMPTY")
    StdOut(`u=>u` = identity )

  def append: (StdOut && StdOut) => StdOut =
    case (StdOut(firstEffect), StdOut(secondEffect)) =>
      println("APPEND")
      StdOut(firstEffect andThen secondEffect)

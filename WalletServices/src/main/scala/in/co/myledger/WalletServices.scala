package controllers

import scala.swing.Action

object Application extends Controller {

  def createTransaction(TransactionRequest request) = Action {
    Ok("Saying hello rest!!")
  }
}

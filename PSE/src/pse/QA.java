/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pse;

class QA
{
  String recordID;
  String recordText;
  public QA(String id, String text)
  {
    recordID = id;
    recordText = text;
  }
  public String toString(){return recordText;}
}
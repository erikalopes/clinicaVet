/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.clinivet.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.edu.fjn.clinivet.annotations.Private;

/**
 *
 * @author vinicius
 */
@Controller
public class IndexController {
   
    //método que chama página index
    @Get("/")
    public void index(){
     
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.factory.scholer;

import exercicesdesignpattern.factory.ChocolatNoirAbstrait;

/**
 *
 * @author tkint
 */
public class ChocolatNoirScholer extends ChocolatNoirAbstrait {

    @Override
    public void afficheToi() {
        System.out.println("Chocolat noir scholer");
    }
}

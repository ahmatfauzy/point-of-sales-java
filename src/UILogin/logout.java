/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UILogin;

import javax.swing.JFrame;

/**
 *
 * @author FAUZI
 */
public class logout {
    public static void Logout(JFrame currentFrame) {
        currentFrame.setVisible(false);
        login l = new login();
        l.setVisible(true);
    }
}

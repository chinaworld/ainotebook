/**
 * Copyright (c) 2006-2010 Berlin Brown and botnode.com/Berlin Research  All Rights Reserved
 *
 * http://www.opensource.org/licenses/bsd-license.php

 * All rights reserved.

 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:

 * * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * * Neither the name of the Botnode.com (Berlin Brown) nor
 * the names of its contributors may be used to endorse or promote
 * products derived from this software without specific prior written permission.

 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * Date: 2/15/2010 
 *   
 * Home Page: http://botnode.com/
 * 
 * Contact: Berlin Brown <berlin dot brown at gmail.com>
 */
package org.berlin.pino.dev.analy.win;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.berlin.seesaw.swing.TeeterPanel;
import org.berlin.seesaw.swing.layout.ITeeterLayout;

public class TestSelectionPanel extends TeeterPanel {
    
    private final JScrollPane scrollPane;
    
    public TestSelectionPanel(final JPanel panel, final JScrollPane scrollPane, final ITeeterLayout layout) {
        
        super(panel, layout);
        this.scrollPane = scrollPane;
    }
    
    /**
     * Construct the layout with the internal swing components.     
     */
    public void constructView() {
                
        final JPanel panel = (JPanel) super.getComponent();
        this.scrollPane.setBackground(Color.WHITE);
        panel.setBackground(Color.WHITE);
        
        final GridBagConstraints constraints = this.getLayout().getConstraints();
        panel.setLayout(this.getLayout().getLayout());
        panel.setPreferredSize(new Dimension(600, 200));
        
        ///////////////////////////////////////////////////
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.weightx = 0;
        constraints.weighty = 0;
        
        this.getLayout().shiftDown();
        panel.add(new JCheckBox("abc", true), constraints);
        this.getLayout().shiftDown();
        
        panel.add(new JCheckBox("abcxxxxxxx", true), constraints);
        this.getLayout().shiftDown();
        
        panel.add(new JCheckBox("abc", true), constraints);        
    }        
    
    /**
     * @return the panel
     * @see org.berlin.seesaw.swing.ITeeterPanel#getComponent()
     */
    public JComponent getComponent() {
        
        return this.scrollPane;
    }    
    
    
} // End of the Class //
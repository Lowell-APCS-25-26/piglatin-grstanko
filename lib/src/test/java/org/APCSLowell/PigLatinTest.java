package org.APCSLowell;

import org.junit.Test;
import static org.junit.Assert.*;

public class PigLatinTest {
   @Test
   public void caseR(){
     PigLatin sim = new PigLatin();
     assertEquals("eastbay", sim.pigLatin("beast"));
     assertEquals("oughday", sim.pigLatin("dough"));
     assertEquals("appyhay", sim.pigLatin("happy"));
   }
   
   @Test
   public void y(){
      PigLatin sim = new PigLatin();
      assertEquals("tryay", sim.pigLatin("try"));
   }
   @Test
   public void vowels(){
      PigLatin sim = new PigLatin();
      assertEquals("eagleway", sim.pigLatin("eagle"));
   }
   @Test
   public void q(){
     PigLatin sim = new PigLatin();
     assertEquals("estionquay", sim.pigLatin("question"));
   }
   @Test
   public void multipleConsonant(){
      PigLatin sim = new PigLatin();
      assertEquals("arstay", sim.pigLatin("star"));
      assertEquals("eethray", sim.pigLatin("three"));
   }
}

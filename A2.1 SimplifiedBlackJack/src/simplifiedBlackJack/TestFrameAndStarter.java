package simplifiedBlackJack;


import stuffBeginnersDontHaveToUnderstand.Version;

/**
 * {@link TestFrameAndStarter} for {@link SimplifiedBlackJackAgent}.
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class TestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_003___2023_04_01__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }

    
    
    
    
    
    /**
     * Method to start test.
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        SimplifiedBlackJackAgent simplifiedBlackJackAgent = new SimplifiedBlackJackAgent();
        simplifiedBlackJackAgent.playBlackJack();
    }//method()
    
}//class

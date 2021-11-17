/**
 * 
 * = algorithm analysis =
 * 
 * - when downloading a file over the Internet
 *   
 *   - Suppose there is an initial 2 -sec delay.
 *   - the download proceeds at 160 K/sec.
 *   
 *   - Then if the file is N kilobytes, the time to download is describes by the formula
 *     T(N) = (N/160) + 2
 *   - This is a liner function, downloading a 8000K file
 *      takes approximately 52 sec,
 *      whereas downloading a file twice as large (16000K) takes about 102 sec, or roughly twice as long.
 *   - This is a "linear algorithm", in which time essentially is directly proportional to amount of input,
 *      which the most efficient algorithm.
 * 
 * - Running times for moderate inputs:
 *   -Cubic > Quadratic > O(NlongN) > Linear
 * 
 * - dominant term(dominates): is the term the one that gets biggest as N gets bigger.
 * 
 * - Cubic function : is a function whose dominant term is some constant time N^3.
 *  - for example :
 *    10N^3+N^2+40N+80 is a cubic function
 *    
 * - Quadratic function : has dominant term that is some constant times N^2
 * 
 * - Linear function : has a dominant term that is some constant times N.
 *  
 * - logarithm : 
 *   - The logarithm is a slowly growing function; 
 *     for instance :
 *      - the logarithm of 1000000(base 2) is only 20.
 *      - O(N log N) -> represents a function whose dominant term is N times the logarithm of N
 *             
 * - growth rate of function :
 *   - The growth rate of function is most important when N is sufficiently latge.
 *   - This justified for 3 reason :
 *     - 1. 
 *     - 2.
 *     - 3. 
 * 
 *    
 */
public class linerAlgorithm {

}

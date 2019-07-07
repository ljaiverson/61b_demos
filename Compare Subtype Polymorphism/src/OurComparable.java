/**
 * @Author: Jun Luo
 * @Date: 07/06/2019
 * @Time: 22:05
 * @Description: our comparable
 */

public interface OurComparable {
    /* Return negative value if this < 0.
     * Return 0 if this equals 0.
     * Return positive value if this > 0.
     */
    public int compareTo(Object o);
}

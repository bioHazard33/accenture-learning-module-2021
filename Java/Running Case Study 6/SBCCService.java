package com.sbcc.service;

import com.sbcc.dao.*;
import java.util.*;

/*The class and methods should be declared as publicand all the attributes should be declared as private.*/
public class SBCCService {

  SBCCBoard sb = new SBCCBoard();

  public int addPlayerObject(String[] pDetails) {
    return sb.addPlayerObject(pDetails);
  }

  public Map<String, Double> findTopPlayerDetails(String playerType) {
    return sb.findTopPlayerDetails(playerType);
  }
}

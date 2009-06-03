/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.lucene.analysis.cn.smart;

public class WordType {

  public final static int SENTENCE_BEGIN = 0;

  public final static int SENTENCE_END = 1;// 句子的开头和结束

  public final static int CHINESE_WORD = 2;// 中文词

  public final static int STRING = 3;

  public final static int NUMBER = 4; // ascii字符串和数字

  public final static int DELIMITER = 5; // 所有标点符号

  public final static int FULLWIDTH_STRING = 6;

  public final static int FULLWIDTH_NUMBER = 7;// 含有全角字符的字符串，含全角数字的数字

}
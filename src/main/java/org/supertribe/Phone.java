/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.supertribe;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Phone {

    private int age;
    private String carrier;
    private String id;
    private String name;
    private String snippet;

    public Phone() {
    }

    public Phone(int age, String carrier, String id, String name, String snippet) {
        this.age = age;
        this.carrier = carrier;
        this.id = id;
        this.name = name;
        this.snippet = snippet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "age=" + age +
                ", carrier='" + carrier + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", snippet='" + snippet + '\'' +
                '}';
    }
}

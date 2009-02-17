/*
 * Copyright 2006-2008 Web Cohesion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.enunciate.examples.csharp.schema.structures;

import org.joda.time.DateTime;
import org.codehaus.enunciate.XmlTransient;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Date;

/**
 * @author Ryan Heaton
 */
@XmlTransient
public class DateTimeXmlAdapter extends XmlAdapter<Date, DateTime> {

  public DateTime unmarshal(Date date) throws Exception {
    return new DateTime(date);
  }

  public Date marshal(DateTime dateTime) throws Exception {
    return dateTime.toDate();
  }
}
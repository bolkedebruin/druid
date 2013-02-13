/*
 * Druid - a distributed column store.
 * Copyright (C) 2012  Metamarkets Group Inc.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package com.metamx.druid.result;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.Interval;

import java.util.List;

/**
 */
public class BySegmentResultValueClass<T>
{
  private final List<T> results;
  private final String segmentId;
  private final Interval interval;

  public BySegmentResultValueClass(
      @JsonProperty("results") List<T> results,
      @JsonProperty("segment") String segmentId,
      @JsonProperty("interval") Interval interval
  )
  {
    this.results = results;
    this.segmentId = segmentId;
    this.interval = interval;
  }

  @JsonProperty("results")
  public List<T> getResults()
  {
    return results;
  }

  @JsonProperty("segment")
  public String getSegmentId()
  {
    return segmentId;
  }

  @JsonProperty("interval")
  public Interval getInterval()
  {
    return interval;
  }

  @Override
  public String toString()
  {
    return "BySegmentTimeseriesResultValue{" +
           "results=" + results +
           ", segmentId='" + segmentId + '\'' +
           ", interval='" + interval + '\'' +
           '}';
  }
}

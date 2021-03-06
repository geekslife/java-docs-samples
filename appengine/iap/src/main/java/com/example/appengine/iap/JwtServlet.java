/**
 * Copyright 2017 Google Inc.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.appengine.iap;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Identity Aware Proxy (IAP) Test application to reflect jwt token issued by IAP. IAP must be
 * enabled on application. {@see https://cloud.google.com/iap/docs/app-engine-quickstart}
 */
@SuppressWarnings("serial")
public class JwtServlet extends HttpServlet {

  private static final String IAP_JWT_HEADER = "x-goog-authenticated-user-jwt";

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.getWriter().print(IAP_JWT_HEADER + ":" + req.getHeader(IAP_JWT_HEADER));
  }
}

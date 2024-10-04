/*
 * Author: Kangeyan Passoubady
 * 1.0
 */
package com.kavinschool.framework.utils;

import org.apache.commons.codec.binary.Base64;

import javax.net.ssl.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Properties;


/**
 * The Class JsonUtil.
 *
 * @author kangs
 */
public class JsonUtil {

    /**
     * Read all.
     *
     * @param rd the rd
     * @return the string
     * @throws java.io.IOException Signals that an I/O exception has occurred.
     */
    public static String readAll(final Reader rd) throws IOException {
        final StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    /**
     * Read json from url.
     *
     * @param url the url
     * @return the string
     * @throws java.io.IOException Signals that an I/O exception has occurred.
     * @throws java.net.URISyntaxException if any.
     */
    public static String readJsonFromUrl(final String url) throws IOException, URISyntaxException {
        final URI uri = new URI(url);
        final URLConnection uc = uri.toURL().openConnection();
        try (InputStream is = uc.getInputStream()) {
            final BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            return JsonUtil.readAll(rd);

        }
    }

    /**
     * Read json from url.
     *
     * @param file the file
     * @return the string
     * @throws java.io.IOException Signals that an I/O exception has occurred.
     */
    public static String readJsonFromUrl(final FileInputStream file) throws IOException {
        try (InputStream is = file) {
            final BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            return JsonUtil.readAll(rd);

        }
    }

    /**
     * Read json from url.
     *
     * @param is the is
     * @return the string
     * @throws java.io.IOException Signals that an I/O exception has occurred.
     */
    public static String readJsonFromUrl(final InputStream is) throws IOException {
        try (is) {
            final BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            return JsonUtil.readAll(rd);

        }
    }

    /**
     * Read json from url.
     *
     * @param urlAddress the url address
     * @param userName   the username
     * @param password   the password
     * @return the string
     * @throws java.io.IOException Signals that an I/O exception has occurred.
     * @throws java.net.URISyntaxException if any.
     */
    public static String readJsonFromUrl(final String urlAddress, final String userName, final String password)
            throws IOException, URISyntaxException {
        {
            final URI uri = new URI(urlAddress);
            final URLConnection uc = uri.toURL().openConnection();
            final String userPass = userName + ":" + password;
            final String basicAuth = "Basic " + new String(new Base64().encode(userPass.getBytes()));
            uc.setRequestProperty("Authorization", basicAuth);

            try (InputStream is = uc.getInputStream()) {
                final BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
                return JsonUtil.readAll(rd);

            }
        }

    }

    /**
     * Trust ssl.
     */
    public static void trustSsl() {
        final Properties systemProps = System.getProperties();
        systemProps.put("javax.net.ssl.keyStorePassword", "passwordForKeystore");
        systemProps.put("javax.net.ssl.keyStore", "pathToKeystore.ks");
        systemProps.put("javax.net.ssl.trustStore", "pathToTruststore.ts");
        systemProps.put("javax.net.ssl.trustStorePassword", "passwordForTrustStore");
        System.setProperties(systemProps);
    }

    /**
     * Accept ssl certificate.
     *
     * @throws java.security.NoSuchAlgorithmException the no such algorithm exception
     * @throws java.security.KeyManagementException   the key management exception
     */
    public static void acceptSslCertificate() throws NoSuchAlgorithmException, KeyManagementException {
        // Create a trust manager that does not validate certificate chains
        final TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {

            @Override
            public void checkClientTrusted(final X509Certificate[] chain, final String authType)
                    throws java.security.cert.CertificateException {

            }

            @Override
            public void checkServerTrusted(final X509Certificate[] chain, final String authType)
                    throws java.security.cert.CertificateException {

            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        }};

        // Install the all-trusting trust manager
        final SSLContext sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());

        // Create all-trusting host name verifier
        final HostnameVerifier allHostsValid = new HostnameVerifier() {
            @Override
            public boolean verify(final String hostname, final SSLSession session) {
                return true;
            }
        };

        // Install the all-trusting host verifier
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
    }

    /**
     * Write as utf 8.
     *
     * @param inputFilePath     the input file path
     * @param inputFileEncoding the input file encoding
     * @param outputFilePath    the output file path
     * @throws java.io.IOException Signals that an I/O exception has occurred.
     */
    public static void writeAsUtf8(final String inputFilePath, final String inputFileEncoding,
                                   final String outputFilePath) throws IOException {
        final BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(inputFilePath), inputFileEncoding));
        String line;

        final Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFilePath), StandardCharsets.UTF_8));

        try {

            while ((line = br.readLine()) != null) {
                out.write(line);
                out.write("\n");
            }
        } finally {
            br.close();
            out.close();
        }
    }

}

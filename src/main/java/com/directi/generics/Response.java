package com.directi.generics;

public class Response<S, F> {
    private final S successResponse;
    private final F failureResponse;

    public Response(S successResponse, F failureResponse) {
        this.successResponse = successResponse;
        this.failureResponse = failureResponse;
    }

    public S getSuccessResponse() {
        return successResponse;
    }

    public F getFailureResponse() {
        return failureResponse;
    }

    public static void main(String[] args) {
        Response<String, String> simpleResponse = new Response<String, String>("won", "lost");
        System.out.println("success response: " + simpleResponse.getSuccessResponse());

        Response<DescriptiveResponse, String> otherResponse = new Response<DescriptiveResponse, String>(new DescriptiveResponse(true, 10), null);
    }

    private static class DescriptiveResponse {
        final boolean didWin;
        final int differenceOfPoints;

        private DescriptiveResponse(boolean didWin, int differenceOfPoints) {
            this.didWin = didWin;
            this.differenceOfPoints = differenceOfPoints;
        }
    }
}

package com.kjwon.foodchoice.users;

import com.kjwon.foodchoice.util.ApiUtils;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserRestController {

    @PostMapping(path = "login")
    public String login() {
      return "test123";
    }
//    private final Jwt jwt;
//
//    private final AuthenticationManager authenticationManager;
//
//    private final UserService userService;
//
//    public UserRestController(Jwt jwt, AuthenticationManager authenticationManager, UserService userService) {
//        this.jwt = jwt;
//        this.authenticationManager = authenticationManager;
//        this.userService = userService;
//    }
//
//    @PostMapping(path = "login")
//    public ApiResult<LoginResult> login(
//            @Valid @RequestBody LoginRequest request
//    ) throws UnauthorizedException {
//        try {
//            Authentication authentication = authenticationManager.authenticate(
//                    new JwtAuthenticationToken(request.getPrincipal(), request.getCredentials())
//            );
//            final User user = (User) authentication.getDetails();
//            final String token = user.newJwt(
//                    jwt,
//                    authentication.getAuthorities().stream()
//                            .map(GrantedAuthority::getAuthority)
//                            .toArray(String[]::new)
//            );
//            return success(new LoginResult(token, user));
//        } catch (AuthenticationException e) {
//            throw new UnauthorizedException(e.getMessage(), e);
//        }
//    }

//    @GetMapping(path = "me")
//    public ApiResult<UserDto> me(
//            // JwtAuthenticationTokenFilter ?????? JWT ?????? ?????? ???????????? ????????????.
//            // ????????? ????????? ???????????? ??????????????? @AuthenticationPrincipal ?????????????????? ???????????? ????????? ????????? ??????(JwtAuthentication)??? ????????? ??? ??????.
//            @AuthenticationPrincipal JwtAuthentication authentication
//    ) {
//        return success(
//                userService.findById(authentication.id)
//                        .map(UserDto::new)
//                        .orElseThrow(() -> new NotFoundException("Could nof found user for " + authentication.id))
//        );
//    }

}